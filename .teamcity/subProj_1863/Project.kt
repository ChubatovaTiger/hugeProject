package subProj_1863

import subProj_1863.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1863")
    name = "subProj 1863"

    buildType(subProj_bt_1863_4)
    buildType(subProj_bt_1863_5)
    buildType(subProj_bt_1863_2)
    buildType(subProj_bt_1863_3)
    buildType(subProj_bt_1863_0)
    buildType(subProj_bt_1863_1)
})
