package subProj_42

import subProj_42.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_42")
    name = "subProj 42"

    buildType(subProj_bt_42_1)
    buildType(subProj_bt_42_0)
    buildType(subProj_bt_42_3)
    buildType(subProj_bt_42_2)
    buildType(subProj_bt_42_5)
    buildType(subProj_bt_42_4)
})
