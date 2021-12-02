package subProj_1076

import subProj_1076.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1076")
    name = "subProj 1076"

    buildType(subProj_bt_1076_4)
    buildType(subProj_bt_1076_5)
    buildType(subProj_bt_1076_2)
    buildType(subProj_bt_1076_3)
    buildType(subProj_bt_1076_0)
    buildType(subProj_bt_1076_1)
})
