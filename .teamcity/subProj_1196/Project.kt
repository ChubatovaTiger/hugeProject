package subProj_1196

import subProj_1196.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1196")
    name = "subProj 1196"

    buildType(subProj_bt_1196_5)
    buildType(subProj_bt_1196_2)
    buildType(subProj_bt_1196_1)
    buildType(subProj_bt_1196_4)
    buildType(subProj_bt_1196_3)
    buildType(subProj_bt_1196_0)
})
