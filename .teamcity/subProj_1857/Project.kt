package subProj_1857

import subProj_1857.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1857")
    name = "subProj 1857"

    buildType(subProj_bt_1857_0)
    buildType(subProj_bt_1857_5)
    buildType(subProj_bt_1857_2)
    buildType(subProj_bt_1857_1)
    buildType(subProj_bt_1857_4)
    buildType(subProj_bt_1857_3)
})
