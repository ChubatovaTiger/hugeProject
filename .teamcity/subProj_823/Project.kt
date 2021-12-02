package subProj_823

import subProj_823.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_823")
    name = "subProj 823"

    buildType(subProj_bt_823_4)
    buildType(subProj_bt_823_3)
    buildType(subProj_bt_823_5)
    buildType(subProj_bt_823_0)
    buildType(subProj_bt_823_2)
    buildType(subProj_bt_823_1)
})
