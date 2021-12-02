package subProj_141

import subProj_141.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_141")
    name = "subProj 141"

    buildType(subProj_bt_141_5)
    buildType(subProj_bt_141_4)
    buildType(subProj_bt_141_3)
    buildType(subProj_bt_141_2)
    buildType(subProj_bt_141_1)
    buildType(subProj_bt_141_0)
})
