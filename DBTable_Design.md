# Entity
字段名 | 字段类型 |  说明
-|-|-
ID | Int | 主键，作为唯一标识该实体的ID |
Type | String | 实体类型 |
Value | String | 属性值 |
Time | String | 时间属性值 |

# Agent
字段名 | 字段类型 |  说明
-|-|-
ID | Int | 主键，作为唯一标识该代理的ID |
Type | String | 代理类型 |
Attribute | String | 属性值 |

# Activity
字段名 | 字段类型 |  说明
-|-|-
ID | Int | 主键，作为唯一标识该活动的ID |
Type | String | 代理类型 |
StartTime | String | 活动开始时间 |
EndTime | String | 活动结束时间 |

# wasAttributedTo
字段名 | 字段类型 |  说明
-|-|-
ID | Int | 主键，作为唯一标识该依赖的ID |
EntityID | Int | 实体ID |
AgentID | Int | 代理ID |

# wasAssociatedWith
字段名 | 字段类型 |  说明
-|-|-
ID | Int | 主键，作为唯一标识该依赖的ID |
ActivityID | Int | 活动ID |
AgentID | Int | 代理ID |

# wasDerivedFrom
字段名 | 字段类型 |  说明
-|-|-
ID | Int | 主键，作为唯一标识该依赖的ID |
EntityID | Int | 衍生实体ID |
EntityID | Int | 被衍生实体ID |
