package subProj_1011

import subProj_1011.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1011")
    name = "subProj 1011"

    buildType(subProj_bt_1011_5)
    buildType(subProj_bt_1011_4)
    buildType(subProj_bt_1011_3)
    buildType(subProj_bt_1011_2)
    buildType(subProj_bt_1011_1)
    buildType(subProj_bt_1011_0)
})
