package subProj_855

import subProj_855.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_855")
    name = "subProj 855"

    buildType(subProj_bt_855_5)
    buildType(subProj_bt_855_4)
    buildType(subProj_bt_855_3)
    buildType(subProj_bt_855_2)
    buildType(subProj_bt_855_1)
    buildType(subProj_bt_855_0)
})
