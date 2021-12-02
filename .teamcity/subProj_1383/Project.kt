package subProj_1383

import subProj_1383.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1383")
    name = "subProj 1383"

    buildType(subProj_bt_1383_5)
    buildType(subProj_bt_1383_0)
    buildType(subProj_bt_1383_1)
    buildType(subProj_bt_1383_2)
    buildType(subProj_bt_1383_3)
    buildType(subProj_bt_1383_4)
})
