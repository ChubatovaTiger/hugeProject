package subProj_858

import subProj_858.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_858")
    name = "subProj 858"

    buildType(subProj_bt_858_4)
    buildType(subProj_bt_858_3)
    buildType(subProj_bt_858_2)
    buildType(subProj_bt_858_1)
    buildType(subProj_bt_858_5)
    buildType(subProj_bt_858_0)
})
