package subProj_316

import subProj_316.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_316")
    name = "subProj 316"

    buildType(subProj_bt_316_2)
    buildType(subProj_bt_316_3)
    buildType(subProj_bt_316_0)
    buildType(subProj_bt_316_1)
    buildType(subProj_bt_316_4)
    buildType(subProj_bt_316_5)
})
