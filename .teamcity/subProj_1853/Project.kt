package subProj_1853

import subProj_1853.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1853")
    name = "subProj 1853"

    buildType(subProj_bt_1853_2)
    buildType(subProj_bt_1853_1)
    buildType(subProj_bt_1853_4)
    buildType(subProj_bt_1853_3)
    buildType(subProj_bt_1853_0)
    buildType(subProj_bt_1853_5)
})
