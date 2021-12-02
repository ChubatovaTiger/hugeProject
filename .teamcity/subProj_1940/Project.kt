package subProj_1940

import subProj_1940.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1940")
    name = "subProj 1940"

    buildType(subProj_bt_1940_1)
    buildType(subProj_bt_1940_0)
    buildType(subProj_bt_1940_5)
    buildType(subProj_bt_1940_4)
    buildType(subProj_bt_1940_3)
    buildType(subProj_bt_1940_2)
})
