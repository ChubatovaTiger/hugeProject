package subProj_1583

import subProj_1583.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1583")
    name = "subProj 1583"

    buildType(subProj_bt_1583_0)
    buildType(subProj_bt_1583_2)
    buildType(subProj_bt_1583_1)
    buildType(subProj_bt_1583_4)
    buildType(subProj_bt_1583_3)
    buildType(subProj_bt_1583_5)
})
