package subProj_1660

import subProj_1660.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1660")
    name = "subProj 1660"

    buildType(subProj_bt_1660_1)
    buildType(subProj_bt_1660_2)
    buildType(subProj_bt_1660_0)
    buildType(subProj_bt_1660_5)
    buildType(subProj_bt_1660_3)
    buildType(subProj_bt_1660_4)
})
