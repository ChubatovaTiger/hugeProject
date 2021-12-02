package subProj_845

import subProj_845.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_845")
    name = "subProj 845"

    buildType(subProj_bt_845_5)
    buildType(subProj_bt_845_3)
    buildType(subProj_bt_845_4)
    buildType(subProj_bt_845_1)
    buildType(subProj_bt_845_2)
    buildType(subProj_bt_845_0)
})
