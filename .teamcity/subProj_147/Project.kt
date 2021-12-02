package subProj_147

import subProj_147.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_147")
    name = "subProj 147"

    buildType(subProj_bt_147_5)
    buildType(subProj_bt_147_4)
    buildType(subProj_bt_147_3)
    buildType(subProj_bt_147_2)
    buildType(subProj_bt_147_1)
    buildType(subProj_bt_147_0)
})
