package subProj_63

import subProj_63.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_63")
    name = "subProj 63"

    buildType(subProj_bt_63_0)
    buildType(subProj_bt_63_3)
    buildType(subProj_bt_63_4)
    buildType(subProj_bt_63_1)
    buildType(subProj_bt_63_2)
    buildType(subProj_bt_63_5)
})
