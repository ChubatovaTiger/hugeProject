package subProj_1889

import subProj_1889.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1889")
    name = "subProj 1889"

    buildType(subProj_bt_1889_1)
    buildType(subProj_bt_1889_0)
    buildType(subProj_bt_1889_5)
    buildType(subProj_bt_1889_4)
    buildType(subProj_bt_1889_3)
    buildType(subProj_bt_1889_2)
})
