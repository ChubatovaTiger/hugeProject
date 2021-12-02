package subProj_1022

import subProj_1022.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1022")
    name = "subProj 1022"

    buildType(subProj_bt_1022_5)
    buildType(subProj_bt_1022_4)
    buildType(subProj_bt_1022_3)
    buildType(subProj_bt_1022_2)
    buildType(subProj_bt_1022_1)
    buildType(subProj_bt_1022_0)
})
