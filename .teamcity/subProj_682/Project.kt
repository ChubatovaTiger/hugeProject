package subProj_682

import subProj_682.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_682")
    name = "subProj 682"

    buildType(subProj_bt_682_4)
    buildType(subProj_bt_682_5)
    buildType(subProj_bt_682_0)
    buildType(subProj_bt_682_1)
    buildType(subProj_bt_682_2)
    buildType(subProj_bt_682_3)
})
