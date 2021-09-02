# Banking
Chức năng đăng nhập hệ thống Ebank bao gồm:

Tiếng Việt

Tiếng Anh

Thoát

Nếu người dùng chọn 1: Chuyển ngôn ngữ giao diện sang tiếng Việt và thực hiện chức năng “kiểm tra đăng nhập”.

Nếu người dùng chọn 2: Giữ giao diện tiếng Anh và thực hiện chức năng “kiểm tra đăng nhập”.

Kiểm tra chức năng Đăng nhập:

1. Yêu cầu nhập số tài khoản:

Kiểm tra số tài khoản phải là một số 
Mỗi số tài khoản phải có 10 chữ số.

2. Nhập mật khẩu:

Kiểm tra độ dài của mật khẩu có đủ độ dài hay không

Kiểm tra mật khẩu có bao gồm chữ và số hay không.

3. Yêu cầu nhập một ký tự hoặc nhiều ký tự trong hình ảnh xác thực:

Tạo mã captcha ngẫu nhiên cho mỗi lần đăng nhập.
Kiểm tra các ký tự đầu vào của captcha có đúng hay không.

Chi tiết hàm: 

Hàm 1: Hiển thị menu yêu cầu người dùng chọn một tùy chọn.

Người dùng chạy chương trình. Chương trình nhắc người dùng nhập Dữ liệu đầu vào.

Tự động tới Hàm 2.


Hàm 2: Thực hiện ngôn ngữ dựa trên tùy chọn đã chọn.

  Hàm 1: Thay đổi ngôn ngữ

    Sử dụng resourceBundle để lấy giá trị của ngôn ngữ theo key trong 2 file là En.properties và Vi.properties tương ứng là tiếng Anh và tiếng Việt

  Hàm 2: Kiểm tra số tài khoản

    Sử dụng Biểu thức chính quy để kiểm tra tính hợp lệ của số tài khoản đã được nhập theo yêu cầu của nhiệm vụ.
    Nếu số tài khoản không hợp lệ, nó sẽ trả về thông báo lỗi tương ứng với ngôn ngữ bạn đã chọn.

  Hàm 3: Kiểm tra mật khẩu

    Sử dụng Biểu thức chính quy để kiểm tra tính hợp lệ của mật khẩu đã nhập.
    Nếu mật khẩu không hợp lệ thì trả về thông báo lỗi tương ứng với ngôn ngữ bạn vừa chọn.

  Hàm 4: Tạo mã captcha ngẫu nhiên

    Sử dụng chức năng Ngẫu nhiên để tạo một chuỗi ngẫu nhiên, sau đó chuyển đổi thành các ký tự (nhập ký tự).

  Hàm 5: Kiểm tra mã captcha

    Sử dụng hàm chứa () để kiểm tra các ký tự captcha đầu vào có tồn tại trong chuỗi captcha được sinh ra lúc đầu không.
    Nếu các ký tự captcha không hợp lệ, thì trả về thông báo lỗi tương ứng với ngôn ngữ bạn đã chọn.

  Hàm 6: Đăng nhập

    Cho phép người dùng nhập số tài khoản, mật khẩu và hình ảnh xác thực từ bàn phím.
    Nếu số tài khoản hợp lệ, thì cho phép người dùng nhập mật khẩu và nếu số tài khoản đã nhập không hợp lệ, sau đó in ra màn hình lỗi và cho phép người dùng nhập        lại.
    Nếu mật khẩu hợp lệ thì cho phép người dùng nhập captcha. Nếu không, sau đó in ra màn hình lỗi và cho phép người dùng nhập lại.
    Nếu hình ảnh xác thực không hợp lệ thì hãy in ra màn hình lỗi.
