package subProj_875

import subProj_875.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_875")
    name = "subProj 875"

    buildType(subProj_bt_875_1)
    buildType(subProj_bt_875_0)
    buildType(subProj_bt_875_5)
    buildType(subProj_bt_875_4)
    buildType(subProj_bt_875_3)
    buildType(subProj_bt_875_2)
})
