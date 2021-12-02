package subProj_983

import subProj_983.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_983")
    name = "subProj 983"

    buildType(subProj_bt_983_2)
    buildType(subProj_bt_983_3)
    buildType(subProj_bt_983_0)
    buildType(subProj_bt_983_1)
    buildType(subProj_bt_983_4)
    buildType(subProj_bt_983_5)
})
