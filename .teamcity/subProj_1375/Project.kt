package subProj_1375

import subProj_1375.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1375")
    name = "subProj 1375"

    buildType(subProj_bt_1375_2)
    buildType(subProj_bt_1375_3)
    buildType(subProj_bt_1375_4)
    buildType(subProj_bt_1375_5)
    buildType(subProj_bt_1375_0)
    buildType(subProj_bt_1375_1)
})
