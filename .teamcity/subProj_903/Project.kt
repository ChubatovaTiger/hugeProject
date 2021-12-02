package subProj_903

import subProj_903.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_903")
    name = "subProj 903"

    buildType(subProj_bt_903_4)
    buildType(subProj_bt_903_5)
    buildType(subProj_bt_903_2)
    buildType(subProj_bt_903_3)
    buildType(subProj_bt_903_0)
    buildType(subProj_bt_903_1)
})
