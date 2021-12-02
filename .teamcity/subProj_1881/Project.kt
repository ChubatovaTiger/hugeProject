package subProj_1881

import subProj_1881.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1881")
    name = "subProj 1881"

    buildType(subProj_bt_1881_5)
    buildType(subProj_bt_1881_4)
    buildType(subProj_bt_1881_3)
    buildType(subProj_bt_1881_2)
    buildType(subProj_bt_1881_1)
    buildType(subProj_bt_1881_0)
})