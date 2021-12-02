package subProj_279

import subProj_279.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_279")
    name = "subProj 279"

    buildType(subProj_bt_279_5)
    buildType(subProj_bt_279_4)
    buildType(subProj_bt_279_3)
    buildType(subProj_bt_279_2)
    buildType(subProj_bt_279_1)
    buildType(subProj_bt_279_0)
})
