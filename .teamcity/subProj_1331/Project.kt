package subProj_1331

import subProj_1331.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1331")
    name = "subProj 1331"

    buildType(subProj_bt_1331_0)
    buildType(subProj_bt_1331_1)
    buildType(subProj_bt_1331_4)
    buildType(subProj_bt_1331_5)
    buildType(subProj_bt_1331_2)
    buildType(subProj_bt_1331_3)
})
