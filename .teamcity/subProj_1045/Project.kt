package subProj_1045

import subProj_1045.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1045")
    name = "subProj 1045"

    buildType(subProj_bt_1045_2)
    buildType(subProj_bt_1045_3)
    buildType(subProj_bt_1045_4)
    buildType(subProj_bt_1045_5)
    buildType(subProj_bt_1045_0)
    buildType(subProj_bt_1045_1)
})
