package subProj_1464

import subProj_1464.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1464")
    name = "subProj 1464"

    buildType(subProj_bt_1464_0)
    buildType(subProj_bt_1464_5)
    buildType(subProj_bt_1464_3)
    buildType(subProj_bt_1464_4)
    buildType(subProj_bt_1464_1)
    buildType(subProj_bt_1464_2)
})
