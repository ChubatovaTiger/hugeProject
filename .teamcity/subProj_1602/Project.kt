package subProj_1602

import subProj_1602.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1602")
    name = "subProj 1602"

    buildType(subProj_bt_1602_2)
    buildType(subProj_bt_1602_1)
    buildType(subProj_bt_1602_0)
    buildType(subProj_bt_1602_5)
    buildType(subProj_bt_1602_4)
    buildType(subProj_bt_1602_3)
})
