package subProj_1346

import subProj_1346.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1346")
    name = "subProj 1346"

    buildType(subProj_bt_1346_5)
    buildType(subProj_bt_1346_4)
    buildType(subProj_bt_1346_3)
    buildType(subProj_bt_1346_2)
    buildType(subProj_bt_1346_1)
    buildType(subProj_bt_1346_0)
})
