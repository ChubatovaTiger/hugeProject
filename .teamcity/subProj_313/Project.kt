package subProj_313

import subProj_313.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_313")
    name = "subProj 313"

    buildType(subProj_bt_313_1)
    buildType(subProj_bt_313_2)
    buildType(subProj_bt_313_0)
    buildType(subProj_bt_313_5)
    buildType(subProj_bt_313_3)
    buildType(subProj_bt_313_4)
})
