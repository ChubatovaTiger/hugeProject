package subProj_1439

import subProj_1439.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1439")
    name = "subProj 1439"

    buildType(subProj_bt_1439_5)
    buildType(subProj_bt_1439_1)
    buildType(subProj_bt_1439_2)
    buildType(subProj_bt_1439_3)
    buildType(subProj_bt_1439_4)
    buildType(subProj_bt_1439_0)
})
