package subProj_1847

import subProj_1847.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1847")
    name = "subProj 1847"

    buildType(subProj_bt_1847_5)
    buildType(subProj_bt_1847_4)
    buildType(subProj_bt_1847_1)
    buildType(subProj_bt_1847_0)
    buildType(subProj_bt_1847_3)
    buildType(subProj_bt_1847_2)
})
