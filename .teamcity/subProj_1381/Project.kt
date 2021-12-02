package subProj_1381

import subProj_1381.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1381")
    name = "subProj 1381"

    buildType(subProj_bt_1381_0)
    buildType(subProj_bt_1381_1)
    buildType(subProj_bt_1381_2)
    buildType(subProj_bt_1381_3)
    buildType(subProj_bt_1381_4)
    buildType(subProj_bt_1381_5)
})
