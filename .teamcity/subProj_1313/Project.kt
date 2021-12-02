package subProj_1313

import subProj_1313.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1313")
    name = "subProj 1313"

    buildType(subProj_bt_1313_3)
    buildType(subProj_bt_1313_2)
    buildType(subProj_bt_1313_5)
    buildType(subProj_bt_1313_4)
    buildType(subProj_bt_1313_1)
    buildType(subProj_bt_1313_0)
})
