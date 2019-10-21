(ns antizer.antd)

(def components '[Affix
                  Alert
                  Anchor
                  Anchor.Link
                  AutoComplete
                  AutoComplete.OptGroup
                  AutoComplete.Option
                  Avatar
                  BackTop
                  Badge
                  Breadcrumb
                  Breadcrumb.Item
                  Button
                  Button.Group
                  Calendar
                  Card
                  Card.Grid
                  Card.Meta
                  Carousel
                  Cascader
                  Checkbox
                  Checkbox.Group
                  Col
                  Collapse
                  Collapse.Panel
                  Comment
                  ConfigProvider
                  DatePicker
                  DatePicker.MonthPicker
                  DatePicker.RangePicker
                  DatePicker.WeekPicker
                  Descriptions
                  Divider
                  Drawer
                  Dropdown
                  Dropdown.Button
                  Empty
                  Form
                  Form.Item
                  Icon
                  Input
                  Input.Group
                  InputNumber
                  Input.Search
                  Input.TextArea
                  Layout
                  Layout.Content
                  Layout.Footer
                  Layout.Header
                  Layout.Sider
                  List
                  List.Item
                  List.Item.Meta
                  LocaleProvider
                  Mention
                  Mention.Nav
                  Mentions
                  Menu
                  Menu.Divider
                  Menu.Item
                  Menu.ItemGroup
                  Menu.SubMenu
                  Modal
                  PageHeader
                  Pagination
                  Popconfirm
                  Popover
                  Progress
                  Radio
                  Radio.Button
                  Radio.Group
                  Rate
                  Result
                  Row
                  Select
                  Select.OptGroup
                  Select.Option
                  Skeleton
                  Slider
                  Spin
                  Statistic
                  Steps
                  Steps.Step
                  Switch
                  Table
                  Table.Column
                  Table.ColumnGroup
                  Tabs
                  Tabs.TabPane
                  Tag
                  Tag.CheckableTag
                  Timeline
                  Timeline.Item
                  TimePicker
                  Tooltip
                  Transfer
                  Tree
                  Tree.DirectoryTree
                  TreeSelect
                  TreeSelect.TreeNode
                  Tree.TreeNode
                  Typography
                  Typography.Paragraph
                  Typography.Text
                  Typography.Title
                  Upload
                  Upload.Dragger])

(def props '[locales])

(def funcs '[message.config
             message.destroy
             message.error
             message.info
             message.loading
             message.success
             message.warn
             message.warning
             Modal.confirm
             Modal.error
             Modal.info
             Modal.success
             Modal.warning
             notification.close
             notification.config
             notification.destroy
             notification.error
             notification.info
             notification.open
             notification.success
             notification.warn
             notification.warning])

(def form-funcs '[getFieldDecorator
                  getFieldError
                  getFieldsError
                  getFieldsValue
                  getFieldValue
                  isFieldsTouched
                  isFieldTouched
                  isFieldValidating
                  resetFields
                  setFields
                  setFieldsValue
                  validateFields
                  validateFieldsAndScroll])
