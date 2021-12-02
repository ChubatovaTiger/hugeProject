package subProj_204

import subProj_204.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_204")
    name = "subProj 204"

    buildType(subProj_bt_204_2)
    buildType(subProj_bt_204_3)
    buildType(subProj_bt_204_4)
    buildType(subProj_bt_204_5)
    buildType(subProj_bt_204_0)
    buildType(subProj_bt_204_1)
})
