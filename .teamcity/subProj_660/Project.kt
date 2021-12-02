package subProj_660

import subProj_660.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_660")
    name = "subProj 660"

    buildType(subProj_bt_660_3)
    buildType(subProj_bt_660_2)
    buildType(subProj_bt_660_1)
    buildType(subProj_bt_660_0)
    buildType(subProj_bt_660_5)
    buildType(subProj_bt_660_4)
})
