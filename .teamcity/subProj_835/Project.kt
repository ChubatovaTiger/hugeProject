package subProj_835

import subProj_835.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_835")
    name = "subProj 835"

    buildType(subProj_bt_835_4)
    buildType(subProj_bt_835_5)
    buildType(subProj_bt_835_2)
    buildType(subProj_bt_835_3)
    buildType(subProj_bt_835_0)
    buildType(subProj_bt_835_1)
})
