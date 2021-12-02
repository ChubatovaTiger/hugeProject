package subProj_346

import subProj_346.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_346")
    name = "subProj 346"

    buildType(subProj_bt_346_3)
    buildType(subProj_bt_346_4)
    buildType(subProj_bt_346_5)
    buildType(subProj_bt_346_0)
    buildType(subProj_bt_346_1)
    buildType(subProj_bt_346_2)
})
