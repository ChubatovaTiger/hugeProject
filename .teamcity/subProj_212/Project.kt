package subProj_212

import subProj_212.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_212")
    name = "subProj 212"

    buildType(subProj_bt_212_5)
    buildType(subProj_bt_212_1)
    buildType(subProj_bt_212_2)
    buildType(subProj_bt_212_3)
    buildType(subProj_bt_212_4)
    buildType(subProj_bt_212_0)
})
