package subProj_544

import subProj_544.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_544")
    name = "subProj 544"

    buildType(subProj_bt_544_0)
    buildType(subProj_bt_544_1)
    buildType(subProj_bt_544_2)
    buildType(subProj_bt_544_3)
    buildType(subProj_bt_544_4)
    buildType(subProj_bt_544_5)
})
