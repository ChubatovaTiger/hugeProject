package subProj_235

import subProj_235.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_235")
    name = "subProj 235"

    buildType(subProj_bt_235_5)
    buildType(subProj_bt_235_4)
    buildType(subProj_bt_235_1)
    buildType(subProj_bt_235_0)
    buildType(subProj_bt_235_3)
    buildType(subProj_bt_235_2)
})
