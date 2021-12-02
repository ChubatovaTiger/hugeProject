package subProj_290

import subProj_290.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_290")
    name = "subProj 290"

    buildType(subProj_bt_290_3)
    buildType(subProj_bt_290_4)
    buildType(subProj_bt_290_5)
    buildType(subProj_bt_290_0)
    buildType(subProj_bt_290_1)
    buildType(subProj_bt_290_2)
})
