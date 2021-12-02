package subProj_1338

import subProj_1338.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1338")
    name = "subProj 1338"

    buildType(subProj_bt_1338_5)
    buildType(subProj_bt_1338_3)
    buildType(subProj_bt_1338_4)
    buildType(subProj_bt_1338_1)
    buildType(subProj_bt_1338_2)
    buildType(subProj_bt_1338_0)
})
