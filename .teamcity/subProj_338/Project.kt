package subProj_338

import subProj_338.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_338")
    name = "subProj 338"

    buildType(subProj_bt_338_3)
    buildType(subProj_bt_338_2)
    buildType(subProj_bt_338_1)
    buildType(subProj_bt_338_0)
    buildType(subProj_bt_338_5)
    buildType(subProj_bt_338_4)
})
