package subProj_1316

import subProj_1316.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1316")
    name = "subProj 1316"

    buildType(subProj_bt_1316_4)
    buildType(subProj_bt_1316_3)
    buildType(subProj_bt_1316_5)
    buildType(subProj_bt_1316_0)
    buildType(subProj_bt_1316_2)
    buildType(subProj_bt_1316_1)
})
