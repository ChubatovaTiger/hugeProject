package subProj_1315

import subProj_1315.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1315")
    name = "subProj 1315"

    buildType(subProj_bt_1315_5)
    buildType(subProj_bt_1315_4)
    buildType(subProj_bt_1315_1)
    buildType(subProj_bt_1315_0)
    buildType(subProj_bt_1315_3)
    buildType(subProj_bt_1315_2)
})
