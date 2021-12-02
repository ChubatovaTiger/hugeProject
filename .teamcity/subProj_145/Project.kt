package subProj_145

import subProj_145.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_145")
    name = "subProj 145"

    buildType(subProj_bt_145_5)
    buildType(subProj_bt_145_4)
    buildType(subProj_bt_145_3)
    buildType(subProj_bt_145_2)
    buildType(subProj_bt_145_1)
    buildType(subProj_bt_145_0)
})
